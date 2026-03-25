import dominio.Curso;
import dominio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Curso curso1 = new Curso("curso java", "descricao curso java", 8);
    Curso curso2 = new Curso("curso js", "descricao curso js", 4);
    Mentoria mentoria1 = new Mentoria("Mentoria java", "descricao mentoria java", LocalDate.now());
    Mentoria mentoria2 = new Mentoria("Mentoria js", "descricao mentoria js", LocalDate.now());


    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria1);
    System.out.println(mentoria2);
}
