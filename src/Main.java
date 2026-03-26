import dominio.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Curso curso1 = new Curso("curso java", "descricao curso java", 8);
    Curso curso2 = new Curso("curso js", "descricao curso js", 4);

    Mentoria mentoria1 = new Mentoria("Mentoria java", "descricao mentoria java", LocalDate.now());
    Mentoria mentoria2 = new Mentoria("Mentoria js", "descricao mentoria js", LocalDate.now());

    Bootcamp bootcamp = new Bootcamp("bootcamp Java Developer", "Descricao bootcamp Java developer");
    bootcamp.adicionarConteudo(curso1);
    bootcamp.adicionarConteudo(curso2);
    bootcamp.adicionarConteudo(mentoria1);

    Dev devCarlos = new Dev("Carlos");
    devCarlos.inscreverBootcamp(bootcamp);
    devCarlos.progredir();
    System.out.println(devCarlos);

    Dev devRoberto = new Dev("Roberto");
    devRoberto.inscreverBootcamp(bootcamp);
    devRoberto.progredir();
    System.out.println(devRoberto);

}
