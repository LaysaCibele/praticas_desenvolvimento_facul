// console.log("Oi");

// let nome = "Laysa";

// console.log(`Olá, ${nome}`);

// let idade = console.log(prompt("Digite a sua idade: "));

// //JSON
// let usuario = {
//     nome: "Laysa",
//     idade: 18,
//     adulto: true,
//     endereco: {
//         rua: 'rua A',
//         numero: 1,
//         cep: 123.456-78
//     }
// }

// let texto = prompt('digite aí')

// console.log(texto)

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-==-=

// Revisão JS
// Tipos e variáveis
//   string - texto -> "Marlon" ou 'Marlon' ou `marlon`
//   number - números inteiros ou não
//   boolean - true ou false
//   undefined - sem valor atribuído
//   function - funções
//   object - objetos
// Variáveis - declaração
// JS te permite 3 formas para declarar uma variável
// var nome = `marlon`
// var sobrenome = 'silva'
// let idade
// const pi = 3.14
// let nome = 'marlon'
// nome = 39

// let imprime = ()=>{
//     console.log('oi')
// }

// let usuario = {
//     nome: 'marlon',
//     idade: 37,
//     adulto: true,
//     endereco: {
//         rua: 'aquela ali',
//         numero:'666',
//         cep: 456464-45
//     }
// }

// console.log(typeof usuario)

// operadores
// aritméticos + - / * % **
// soma +
// subtração -
// divisão /
// multiplicação *
// resto da divisão por inteiro %
// exponenciação **
// console.log(10**3)
// lógicos -> and && or || not !
// Relacionais
// maior que >
// menor que <
// maior ou igual a >=
// menor ou igual a <=
// igual a? ==
// diferente a? !=
// console.log("10" == 10) //não analisa o tipo
// console.log("10" === 10) //analisa o tipo
// console.log('10' != 10) //não analisa o tipo
// console.log('10' !== 10) //analisa o tipo

// análise condicional
// let n = "marlon"

// if(n == "marlon"){
//     console.log('existe')
// }else{
//     console.log('n existe')
// }
// let nome = 'marlon'
// console.log(`olá, ${nome}`)

// WOM - window object model
// alert('oi')
// let texto = prompt("digite alguma coisa, amado")
// console.log(texto)
// const pi = 3.17
// pi = 5
// console.log(pi)

// const user = {
//     nome: 'marlon'
// }
// user.nome = 'carlos'
// console.log(user.nome)

// array - declaração
// todo array tem um sistema de indexação
// que parte do 0 ao n-1
//let nomes = ['marlon','carlos','joelma']
// localizar o primeiro índice
//console.log(nomes[0])
//nomes[2]='ximbinha'
// substituir o terceiro índice
//console.log(nomes[2])
// imprimir o vetor inteiro
//console.log(nomes)

//Arrays

//let numeros = [1,8, 3, 6, 11]
//console.log(numeros.length)
//console.log(numeros[numeros.length -1])
//numeros[2] = 89

// criar um array vazio
//let num = []
//num[9] = 'oi'

//console.log(num)
//let coisas = [10,true,'Laysaa',()=>{console.log('oi')}]

//let matriz = [
//    [10,12], 
//    [6,5]
//]

//console.log(matriz[0][0])
//console.log(coisas[3])

//array methods
//let numeros = [1,5,3,8,4]
//numeros.push(10)
// numeros.pop()
// console.log(numeros.pop)
// console.log(numeros)

//inserir e remover no primeiro´index

// numeros.unshift(12) //insere
// numeros.shift()

// console.log(numeros)


// let numeros = [1,11,52, 55, 65, 21, 22, 111, 11111]
// numeros.sort(function(a, b){
//     return a-b
// })
// console.log(numeros)


// let nomes = ['Ana', 'João', 'Marcelo']

// nomes.forEach(function(elemento, indice, array){
//     console.log(`
//         ${elemento},
//         ${indice},
//         ${array}
//         `)
// })


//funções auto-executável não podem ser reutilizadas
// (function imprime(){
//       console.log("oi")
// })()

// imprime()

// let imprime = () => {
//     console.log('oi')
// }

//arrow function
// let imprime = a => console.log(a)


// function retorna_oi(){
//     return 'oi'
// }

// console.log(retorna_oi())

// function soma (a, b){
//     return a + b
// }

// console.log(soma(2, 4))


//callback uma função serve como entrada de parâmetro para outra função

let numeros = [5,8,6,7]
let mapeados = numeros.map((elemento)=>{
    return elemento % 2 != 0 ? 'impar':'par'
})

let filtrados = numeros.filter((elemento)=>{
    return elemento > 6
})
console.log(numeros)