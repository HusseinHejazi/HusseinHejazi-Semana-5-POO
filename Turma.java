public class Turma {
      private String nome;
      private String curso;
      private int quantidadeDeAlunos;
      private int serie;
            
      public Turma(String n, String c, int qda, int s){
         nome = n;
         curso = c;
         quantidadeDeAlunos = qda;
         serie = s;
      }         
            public String getNome() {
               return nome;
            }
            
            public String getCurso() {
               return curso;
            }
            
            public int getQuantidadeDeAlunos() {
               return quantidadeDeAlunos;
            }
            
            public int getSerie() {
               return serie;
            }
            
            public void setNome(String n) {
               nome = n;
            }
            public void setCurso(String c) {
               curso = c;
            }
            public void setQuantidadeDeAlunos(int qda) {
               quantidadeDeAlunos = qda;
            }
            public void setSerie(int s) {
               serie = s;
            }
      }
   
           