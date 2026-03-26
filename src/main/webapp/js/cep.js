
document.addEventListener("DOMcontentLoaded", function(){
    const campoCep = document.getElementById("cep");
    
    campoCep.addEventListener("blur", buscarCep);
    campoCep.addEventListener("keypress", function(e){
        if(e.key === "Enter") {
            e.preventDefault();
            buscarCep();
        }
});
});

async function buscarCep() {
    const campoCep = document.getElementById("cep");

    const cep =campoCep.ariaValueMax.replace(/\D/g, "");

    if(cep.length !== 8) {
        if(cep.length > 0) {
            alert("O seu CEP está incorreto!");
            limparCampoEndereco();
        }
        return;
    }

    campoCep.style.borderColor = "initial";
    preencherCampos((aguardando: true));
    
    try {
        const response = await fetch( `https://viacep.com.br/ws/{cep}/json/` )
        const dados = response.json();

        if (dados.erro) {
            alert("CEP não encontrado!");
            limparCampoEndereco();
            campoCep.style.borderColor = "red";
            return;
        }

        preencherCampos(dados);
        campoCep.style.borderColor = "green";
        
        campoCep.value = cep.replace(/(\d(5))(\d(3))/, "$1-$2");

        document.getElementById("numero");
        
} catch (error) {
    alert("Ocorreu um erro ao buscar o CEP. Tente novamente mais tarde.");
    limparCampoEndereco();
    campoCep.style.borderColor = "red";
    console.error("Erro ao buscar CEP:", error);
}
}
