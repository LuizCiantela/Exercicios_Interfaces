public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("1234");
        Cliente cliente = new Cliente("abcd");

        SistemaInterno sistema = new SistemaInterno();
        sistema.login(gerente, "1234"); // Deve mostrar "Login realizado com sucesso!"
        sistema.login(cliente, "SenhaSuperForte123"); // Deve mostrar "Senha incorreta. Acesso negado."
    }
}