// JSON: JavaScript Object Notation

//declarar um objeto js

// let usuario = {
//     nome: "Laysa",
//     idade: 18,
//     endereco: {
//         rua: "rua A",
//         n: 123,
//         bairro: "PPPP"
//     }
// }

// console.log(usuario.idade)

// console.log(usuario['nome'])

// usuario.id = 0
// console.log(usuario)

// console.log(usuario.endereco.rua)

// //objetos n podem ser integralmentes renderizados no template
// document.body.innerHTML = usuario

// document.body.innerHTML = usuario.nome
// document.body.innerHTML = usuario.endereco.bairro


//COMANDOS DE CONVERSÃO

// console.log(typeof usuario)
// // comando para conevrter objeto para string
// let copia = JSON.stringify(usuario)
// console.log(typeof copia)
// console.log(copia)

// let copia2 = JSON.parse(copia)
// console.log(typeof copia2)
// console.log(copia2)
// console.log(copia2.nome)


// Local Storage | Session Storage
// sessão se encerra quando fecho o navegador
// local é enquanto eu estiver com os dados preservados no meu navegador

//localStorage.setItem("nome", "Laysa") //mesmo ao fechar o navegador, esse dado foi preservado
//sessionStorage.setItem("idade", 18) // ao fechar o navegador, os dados somem


// let nome = localStorage.getItem('nome')

// localStorage.setItem("sobrenome", "Stark")

//comando períodico
// let contador = 0

// if (localStorage.getItem('contagem')){
//     contador = localStorage.getItem('contagem')
// }

// setInterval(() =>{
//     document.body.innerHTML = contador
//     localStorage.setItem('contagem', contador)
//     contador++
// }, 1000);

//--=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
//DOM -> POO com HTML
// Fetch -> Consumo de API


//todo DOM precisa começar com document

//modificar pelo id
// document.getElementById('primeiro').style.color = 'purple'
// document.getElementById('segundo').style.color = 'pink'

// //modificar pela classe
// document.getElementsByClassName('texto')[0].style.background = 'pink'
// document.getElementsByClassName('texto')[1].style.background = 'purple'

// //modificar pelo nome da tag

// document.getElementsByTagName('p')[2].style.textShadow = '3px 3px 3px purple'

// //query precisa inserir o símbolo do seletor
// document.querySelector('#primeiro').style.textShadow = '3px 3px 3px white'

// document.querySelector('.texto')[0].style.color = 'white'

// let paragrafos = document.querySelectorAll('.texto')
// paragrafos[0].style.color = 'blue'
// console.log(paragrafos)


//fetch -> consumir API
function buscar(){   
    let pokemon = document.querySelector('#pokemon').value
    fetch('https://pokeapi.co/api/v2/pokemon/'+pokemon)
        .then(response => {
            return response.json()
    })
    .then(data => {
        console.log(data)
        console.log(data.name)
        document.querySelector('#imagem').src = data.sprites.other['official-artwork'].front_default
        document.querySelector('#nome').innerHTML = data.name
        document.querySelector('#id').innerHTML = data.id
    })
    .cath(e => {
        console.log(e)
        alert('não achado!')
    })
}