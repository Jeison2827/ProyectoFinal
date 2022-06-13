let campo = document.querySelector("#socialcard");
let profilePicture = document.getElementById("pimg");


let msg = "Solo puedes dar un like por obra de arte";
function contar() {
    let contador = 0;
    document.getElementById("btnlikes").innerHTML = contador=1;
    if ((contador =! 0) ) {
        Swal.fire({
            title: "¡Le has dado like a esta obra de arte!",
            text: "¡Gracias por darle un like a esta obra de arte!",
            icon: "success",
        })
    }
    else if (contador===1) {
        Swal.fire({
            title: "¡Ya has dado like a esta obra de arte!",
            text: "¡Gracias por darle un like a esta obra de arte!",
            icon: "warning",
        })
    }
}

const getData = async () => {
    const resp = await fetch(url);
    console.log(resp);

    const data = await resp.json();
    data.forEach((card) => {
        const { nombre, imagen, precio, likes, coleccion, descripcion } = card;
        campo.innerHTML += ` 
        <div class="card">
                <img src="${imagen}" alt="">
                <p style="color:#0015FF; font-weight:bold">${"@" + nombre}</p>
                <p style="font-weight:bold;color:#0C85E8;font-size:18px">₿${precio}</p>
                <p>${"Colección: " + coleccion}</p>
                <p>${descripcion}</p>
                <button id="btncomprar" style="border-radius:50px;width: 100px;height: 60px;margin-left: 150px;" class="btn btn-primary">Comprar</button>         
                <button id="btnlikes" class="btn btn-primary" style="border-radius:50px;width: 100px;height: 60px;margin-left: 150px; margin-top: 20px" onclick="contar()"> <i class="fa fa-thumbs-up" aria-hidden="true"></i> ${likes} Like</button>
            </div> 
        `;
    });
};

window.addEventListener("DOMContentLoaded", getData);


let data = sessionStorage.getItem("newUser");
let userData = JSON.parse(data);

if (userData.rol === "Comprador") {
    profilePicture.innerHTML = `<div>
  <a href="../web/perfilComprador.html"><img style="margin-left:100px" class="profile-pic" src=${userData.imagen} alt="userPicture"/></a>
  <h5 style="color:white;font-weight:normal">${userData.name}</h5>
  </div>`
} else if (userData.rol === "Artista") {
    profilePicture.innerHTML = `<div>
  <a href="../web/perfilArtista.html"><img style="margin-left:100px" class="profile-pic" src=${userData.imagen} alt="userPicture"/></a>
  <h5 style="color:white;font-weight:normal">${userData.name}</h5>
  </div>`
}

console.log(userData.imagen);
console.log(profilePicture);