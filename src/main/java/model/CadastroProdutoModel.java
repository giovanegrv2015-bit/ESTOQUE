package model;

public class CadastroProdutoModel {
    
    private int id;
    private String codigodBarra;
    private String nomeProduto;
    private String fabricante;
    private String maca;
    private String dataFabricante;
    private String dataVencimento;
    private long quantidade;
    private String valor;
    private String total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigodBarra() {
        return codigodBarra;
    }

    public void setCodigodBarra(String codigodBarra) {
        this.codigodBarra = codigodBarra;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMaca() {
        return maca;
    }

    public void setMaca(String maca) {
        this.maca = maca;
    }

    public String getDataFabricante() {
        return dataFabricante;
    }

    public void setDataFabricante(String dataFabricante) {
        this.dataFabricante = dataFabricante;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
