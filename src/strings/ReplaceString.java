package strings;

import java.util.ArrayList;
import java.util.List;

public class ReplaceString {

    public static void main(String[] args) {

        String cpf = "036.555.971-77";
        System.out.println("CPF normal..: " + cpf);

        String cpfReplace = cpf
                .replace(".", "")
                .replace("-", "")
                .replace(" ", "");
        System.out.println("CPF replace.: " + cpfReplace);

        System.out.println();

        String cnpj = "24.580.684/0001-06";
        System.out.println("CNPJ normal.: " + cnpj);

        String cnpjReplace = cnpj
                .replace(".", "")
                .replace("-", "")
                .replace("/", "")
                .replace(" ", "");
        System.out.println("CNPJ replace: " + cnpjReplace);


        System.out.println();

        List listaDeCpf = new ArrayList();
        listaDeCpf.add(cpfReplace);

        int i;
        String[] vetorDeCpf = new String[cpf.length()];

        //Convertendo de ArrayList para Array(Matriz)
        vetorDeCpf = (String[]) listaDeCpf.toArray(new String[0]);

        for (i = 0; i < listaDeCpf.size(); i++) {

            System.out.println(listaDeCpf.get(i));
            System.out.println(vetorDeCpf[i]);

        }

        System.out.println(vetorDeCpf.length);
    }
}
