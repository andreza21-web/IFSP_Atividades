ANDREZA CB3012191    /   LIDIANE CB3012026 


<h1>LP1I3- Trabalho FINAL</h1>

Link do video https://youtu.be/BSyo2BSaJxs


<h2>Exercício 01(1,0)</h2>

Reescreva as propriedades e métodos da classe Data, deixando-os de acordo com o padrão UML (Getter e Setter).

<h2>Exercício 02 (5,0)</h2>

Crie a classe ConsultaAgendada conforme especificado abaixo (2,0):

ConsultaAgendada

- data: Data
- hora: Hora
- nomePaciente: String
- quantidade: int (static)
- nomeMedico: String
+ ConsultaAgendada ()
+ ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p,
String m)
+ ConsultaAgendada (Data d, Hora h, String p, String m)
+ setData(int a, int b, int c)
+ setData()
+ setHora(int a, int b, int c)
+ setHora()
+ setNomePaciente(String p)
+ setNomePaciente()
+ setNomeMedico(String m)
+ setNomeMedico()
+ getAmostra(): int
+ getData(): String
+ getHora(): String
+ getNomePaciente (): String
+ getNomeMedico(): String

O construtor ConsultaAgendada deve nos permitir a digitação dos valores de data,hora, nome do paciente e do médico;

Os outros dois construtores devem receber os valores de data, hora, nome do paciente e do médico sob a forma de parâmetros;

Qualquer construtor chamado deve acrescer 1 no atributo quantidade.

Os métodos setData(), setHora(), setNomePaciente(), setNomeMedico() devem nos permitir alterar os valores das respectivas propriedades através da digitação de novos valores;

Os demais métodos “set” devem alterar os valores das propriedades a partir dos parâmetros recebidos;

O método getData() deve nos devolver a data no formato: dd/mm/aa;

O método getHora() deve nos devolver a hora no formato: hh:mm:ss.

<h2>Exercício 03 (2,0) </h2>

Para testar a classe criada siga os passos abaixo respeitando a ordem em que eles serão solicitados:

Usando a classe ConsultaAgendada instancie o objeto p1 inicializado-o com o construtor ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p, String m);

 Exiba todas as propriedades de p1;

Agora instancie o objeto p2 usando o construtor ConsultaAgendada ();

 Exiba todas as propriedades de p2;

 Usando os métodos setData(), setHora(), setNomePaciente(), setNomeMedico altere
as propriedades de p1;

 Exiba todas as propriedades de p1 novamente.

Exiba a quantidade final de consultas.

<h2>Exercício 04 (2,0)</h2>

Escreva todo o resultado obtido no exercício 3 em um arquivo texto.