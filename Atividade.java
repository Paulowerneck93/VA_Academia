abstract class Atividade extends Treino {
  String nome;
  float carga;
  int repeticoes;

void relatorioExercicio(){
  System.out.println(
    "Nome: " + nome +
    "\nCarga: " + carga +
    "\nNumero de repeticoes: " + repeticoes);
  }
}