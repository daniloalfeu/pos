package aula1;

public class test {

    public static void main(String[] args) {
        int idade = 18;
        final int HABILITACAO = 18;
        if (idade >= HABILITACAO) {
            System.out.println("Autorizado a dar entrada na Habilitação! ");
        } else {
            int anos = HABILITACAO - idade;
            if (anos ==1) {
                System.out.println("Ainda falta" +anos +"ano para dar entrada na Habilitação");
            }else {
                System.out.println("Ainda Faltam" +"anos para dar entrada na Habilitaçõa");
            }
        }
    }
}
