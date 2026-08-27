//ARRAY DE ALUNOS
 
let alunos = [];


 //PEGANDO ELEMENTOS DO HTML
 

const formulario = document.getElementById("formAluno");

const campoNome = document.getElementById("nome");

const campoIdade = document.getElementById("idade");

const campoNota = document.getElementById("nota");

const mensagem = document.getElementById("mensagem");

const listaAlunos = document.getElementById("listaAlunos");


 
 //EVENTO DO FORMULÁRIO
 

formulario.addEventListener("submit", function(event) {

     //Impede o formulário de recarregar a página
    event.preventDefault();


       
     //LENDO OS DADOS
       

    const nome = campoNome.value;

    const idade = Number(campoIdade.value);

    const nota = Number(campoNota.value);


       
     //VALIDAÇÃO
       

    if (nome === "") {

        mensagem.innerHTML = "Digite o nome do aluno.";

        return;
    }


    if (idade <= 0) {

        mensagem.innerHTML = "Digite uma idade válida.";

        return;
    }


    if (nota < 0 || nota > 10) {

        mensagem.innerHTML = "A nota deve estar entre 0 e 10.";

        return;
    }


       
     //CRIANDO OBJETO
       

    const aluno = {

        nome: nome,

        idade: idade,

        nota: nota
    };


       
     //ADICIONANDO NO ARRAY
       

    alunos.push(aluno);


       
     //VERIFICANDO SITUAÇÃO
       

    let situacao;


    if (nota >= 7) {

        situacao = "Aprovado";

    } else if (nota >= 5) {

        situacao = "Recuperação";

    } else {

        situacao = "Reprovado";
    }


       
     //MOSTRANDO RESULTADO
       

    mensagem.innerHTML = `
        <strong>${nome}</strong> foi cadastrado com sucesso!<br>
        Nota: ${nota}<br>
        Situação: ${situacao}
    `;


       
     //ATUALIZAR LISTA
       

    mostrarAlunos();


       
     //LIMPAR FORMULÁRIO
       

    formulario.reset();

});


 
 //FUNÇÃO PARA MOSTRAR OS ALUNOS
 

function mostrarAlunos() {

     //Limpa o conteúdo anterior
    listaAlunos.innerHTML = "";


       
     //IF
       

    if (alunos.length === 0) {

        listaAlunos.innerHTML = "Nenhum aluno cadastrado.";

        return;
    }


       
     //FOR
       

    for (let i = 0; i < alunos.length; i++) {

        const aluno = alunos[i];


         //Verificando situação

        let situacao;

        let classe;


        if (aluno.nota >= 7) {

            situacao = "Aprovado";

            classe = "aprovado";

        } else if (aluno.nota >= 5) {

            situacao = "Recuperação";

            classe = "recuperacao";

        } else {

            situacao = "Reprovado";

            classe = "reprovado";
        }


         //==================================
         //CRIANDO ELEMENTO HTML
         //==================================

        const div = document.createElement("div");

        div.classList.add("aluno");

        div.classList.add(classe);


        //inserindo HTML
        div.innerHTML = `

            <h3>${aluno.nome}</h3>

            <p>
                <strong>Idade:</strong>
                ${aluno.idade}
            </p>

            <p>
                <strong>Nota:</strong>
                ${aluno.nota}
            </p>

            <p>
                <strong>Situação:</strong>
                ${situacao}
            </p>

        `;


         //==================================
         //ADICIONANDO NA PÁGINA
         //==================================

        listaAlunos.appendChild(div);
    }
}