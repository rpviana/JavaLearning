public class App {
    public static void main(String[] args) throws Exception {
        
        Professor prof = new Professor(14549, "Luis", "Santos", 1985, "Programacao");
        //System.out.println(prof);
        Turma turma = new Turma("ss", "Prog", 2004, 2007);
        //System.out.println(turma);
        Aluno aluno1 = new Aluno("C0mi", "Filipe", "Soblirov", 2009, turma);
        //System.out.println(aluno1);
        Aluno aluno2 = new Aluno("2xzs", "Rodrigo", "Viana", 2008, turma);
        //System.out.println(aluno2);
        Aluno aluno3 = new Aluno("222s", "Lucas", "Soares", 2007, turma);
        //System.out.println(aluno3);

        System.out.println("Nome completo do Professor: " + prof.getNomeCompleto());
        System.out.println("\nInformacao da Turma: \n" + turma.getInfoTurma());
        System.out.println("Nome completo do Aluno 1: " + aluno1.getNomeCompleto());
        System.out.println("Nome completo do Aluno 2: " + aluno2.getNomeCompleto());
        System.out.println("Nome completo do Aluno 3: " + aluno3.getNomeCompleto());
        System.out.println("\nIdade do " + aluno1.getNomeCompleto() + ": "+ aluno1.getIdade());
        System.out.println("Idade do " + aluno2.getNomeCompleto() + ": "+ aluno2.getIdade());
        System.out.println("Idade do " + aluno3.getNomeCompleto() + ": "+ aluno3.getIdade());
 

        
    }
}
