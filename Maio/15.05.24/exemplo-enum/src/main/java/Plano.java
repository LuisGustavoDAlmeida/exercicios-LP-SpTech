public enum Plano {
    BRONZE("Bronze", 109.99),
    PRATA("Prata", 150.99),
    OURO("Ouro", 200.99);

    private String descricao;
    private Double valor;

    Plano(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
