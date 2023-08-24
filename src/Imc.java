public class Imc {
    private double peso;
    private double altura;
    private String genero;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String calcularImc() {
        double imc = peso / (altura * altura);

        if (genero.equals("Mulher")) {
            if (imc < 19.1) {
                return "abaixo do peso";
            } else if (imc < 25.8) {
                return "no peso normal";
            } else if (imc < 27.3) {
                return "marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "acima do peso ideal";
            } else {
                return "obeso";
            }
        } else if (genero.equals("Homem")) {
            if (imc < 20.7) {
                return "abaixo do peso";
            } else if (imc < 26.4) {
                return "no peso normal";
            } else if (imc < 27.8) {
                return "marginalmente acima do peso";
            } else if (imc < 31.1) {
                return "acima do peso ideal";
            } else {
                return "obeso";
            }
        } else {
            return "Gênero inválido";
        }
    }
}
