package VetorDeClasses;

public class Main {
    public static final int QTD_ALUNOS = 10; 

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[QTD_ALUNOS];

        alunos[0] = new Aluno("Ana", "12345", 7.5);
        alunos[1] = new Aluno("Bruno", "67890", 4.8);
        alunos[2] = new Aluno("Carla", "54321", 8.2);
        alunos[3] = new Aluno("David", "11223", 5.0);
        alunos[4] = new Aluno("Eliana", "33445", 6.7);
        alunos[5] = new Aluno("Felipe", "55678", 9.1);
        alunos[6] = new Aluno("Gabriela", "99887", 3.9);
        alunos[7] = new Aluno("Henrique", "22334", 4.2);
        alunos[8] = new Aluno("Isabela", "77655", 7.0);
        alunos[9] = new Aluno("João", "88999", 6.3);

        int aprovadosCount = 0;
        int reprovadosCount = 0;

        Aluno[] aprovados = new Aluno[QTD_ALUNOS]; 
        Aluno[] reprovados = new Aluno[QTD_ALUNOS];

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].mediaFinal >= 5.0) {
                aprovados[aprovadosCount] = alunos[i];
                aprovadosCount++;
            } else {
                reprovados[reprovadosCount] = alunos[i];
                reprovadosCount++;
            }
        }

        System.out.println("Lista de Alunos Aprovados");
        imprimir(aprovados, aprovadosCount);

        System.out.println("Lista de Alunos Reprovados");
        imprimir(reprovados, reprovadosCount);
    }

    public static void imprimir(Aluno[] alunos, int count) {
        for (int i = 0; i < count; i++) {
            System.out.printf("Nome: %s, Matrícula: %s, Média Final: %.2f\n",
                    alunos[i].nome, alunos[i].matricula, alunos[i].mediaFinal);
        }
    }
}

class Aluno {
    String nome;
    String matricula;
    double mediaFinal;

    public Aluno(String nome, String matricula, double mediaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.mediaFinal = mediaFinal;
    }
}
