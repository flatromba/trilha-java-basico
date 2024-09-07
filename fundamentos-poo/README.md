## Fundamentos de POO
## Conceito de POO
- **Baixo nível:** São linguagens que estão mais próximas da interpretação da máquina.
Ex.: Linguagem Assembly, C
- **Alto nível:** São linguagens que disponibilizam uma proposta de sintaxe mais próxima da interpretação humana.
Ex.: Java, JavaScript, Python
1. **Programação estruturada**
Programação a qual implementamos algoritmos com estruturas sequenciais denominados de procedimentos lineares, podendo afetar o valor das variáveis, fazendo uso extensivo das construções de fluxo de seleção e repetição.
2. **Programação orientada a objetos**
É baseado no conceito de "objetos" que podem conter dados na forma de campos(atributos) e códigos na forma de procedimentos(métodos). 

**Obs.:** Enquanto a programação estruturada é voltada a procedimentos e funções a programção orientada a objetos é voltada a conceitos como classes e objetos.
## Classes
Toda a estrutura de código na linguagem Java é distribuido em arquivos **.java** denominados de **CLASSE**. As classes existentes são compostas por: Identificador, Características e Comportamento.
- Classe(`class`): estrutura ou representação que direciona a criação dos objetos.
- Identificador(`identity`): propósito aos objetos que serão criados.
- Características(`states`): conhecido como **atributos**, é toda a informação que representa o estado do objeto.
- Comportamentos(`behavior`): conhecido como **métodos**, é toda parte comportamental de um objeto.
- Instância(`new`): ato de criar um objeto a partir de uma estrutura definida.
1. Classificação
- Classe de modelo: classes que representam estrutura de domínio de aplicação, como: Cliente, Pedido, Nota Fiscal. (model)
- Classe de serviço: classes que contém regras de negócio e validação do sistema. (service)
- Classe de repositório: classes que contém uma integração com o bando de dados. (repository)
- Classe de controle: classes que possuem a finalidade de disponibilzar alguma comunicação externa, como http, web. (controller)
- Classe utilitária: classe que contém recursos comuns a toda aplicação. (util)
## Pacotes
A linguagem dispõe de um recurso que organiza as classes padrão e criadas por nós em pacotes(package), os pacotes são subdiretórios a partir da pasta src onde estão localizadas as classes da linguagem e as que forem criadas para o projeto.
1. Nomenclatura
- Comercial(com)
- Governamental(gov)
- Codigo aberto(org)
2. Identificação
Uma das características de uma classe é sua identificação, porém quando essa classe é organizada por pacotes ela passa a ter duas identificações. O nome simples e o nome qualificado. Ex.: `com.controle.acesso.model.Usuario`

3. Package x Import
A localização de uma classe é definida pela palavra reservada package, para a utilização de uma classe existente em outros pacotes necessitamos realizar a importação(`import`).
Ex.:
```
package com.mastersoft.clinical.service;

import com.mastersoft.clinical.model.Exame;

public class ExameService {
    void salvarExame (Exame exame) {

    }
}
```
## Modificadores
Utilizamos três palavras reservadas e um conceito default para definir os quatro tipos de visibilidade de atributos, métodos e classes.
1. Public
Quando é definido como public qualquer classe em qualquer pacote pode visualizar tais recursos.
2. Private
Modificador de acesso que restringe o acesso a atributos e métodos de uma classe a apenas essa classe.
3. Protected
permite que um membro seja acessado por classes do mesmo pacote ou por meio de herança, seus membros herdados não são acessíveis a outras classes fora do pacote em que foram declarados.
4. Default 
Está fortemente associado a organização das classes por pacotes, algumas implementações não precisam estar disponíveis por todo o projeto e este modificador restringe a visibilidade.
## Getters e Setters
São métodos para buscar valores de atributos ou definir novos valores de instâncias de classes.**Getter:** Retorna o valor de um atributo específico. **Setter:** Defini um novo valor ao atributo específico.
- Os atributos precisam ter o modificador de acesso private. Ex.: `private String nome`
- Como os atributos estão somente no nivel de classe usa-se os métodos **get** e **set**. Ex.: `getNome()`, `setNome(String novoNome)`

Ex.:  
```
package Escola;
public class Aluno {
    private String nome;
    private int idade;

    public String getNome () {
        return nome;
    }

    public void setNome (String novoNome) {
        this.nome=novoNome;
    }

    public int getIdade () {
        return idade;
    }

    public void setIdade (int novaIdade) {
        this.idade=novaIdade;
    }
}

package Escola;
public class Escola {
    public static void main (String[] args) {
        Aluno flavio=new Aluno();
        flavio.setNome("Flávio");
        flavio.setIdade(30);

        System.out.println("O aluno "+aluno.getNome()+" tem "+flavio.getIdade()+" anos");
    }
}
```
## Construtores
Um método sem retorno com mesmo nome da classe e com os mesmos atributos. Ex. :
```
public Pessoa (String cpf, String nome) {
    this.cpf=cpf;
    this.nome=nome;
}
```
## Enums
É um tipo especial de classe onde os objetos são previamente criados, imutáveis e disponíveis em toda a aplicação.Usa-se **Enum** quando o modelo de negócio contém objetos que não sofrerão tanta alteração de valores. Ex.: **grau de escolaridade**: Analfabeto, Fundamental, Médio, Superior.

**OBS.:** enum NÃO É uma lista de constantes

Ex.:
```
public enum EstadoSul {
    RIO_GRANDE_DO_SUL ("RS","Rio Grande do Sul"),
    SANTA_CATARINA ("SC","Santa Catarina"),
    PARANA ("PR","Paraná");

    private String nome;
    private String sigla;

    private EstadoSul (String nome, String sigla) {
        this.nome=nome;
        this.sigla=sigla;
    }

    public String getNome () {
        return nome;
    }

    public String getSigla () {
        return sigla;
    }

    public String getNomeMaisculo () {
        return nome.toUpperCase();
    }
}
```
## UML
**LINGUAGEM DE MODELAGEM UNIFICADA** é uma notação que possibilita a representação gráfica do projeto, na UML existem três conceitos(Diagramas, Elementos e Relacionamentos)
1. Diagramas
- Estrutural
    - Diagrama de classe: utilizado para fazer a representação de estruturas de classes de negócio, interfaces e outros componentes do sistema. A estrutura de classes é consituída por:
        - Identificação: Nome e/ou finalidade da classe
        - Atributos: Propriedades e/ou características
        - Operações: Ações e/ou métodos    
    - Diagrama de objeto: representa os objetos existentes em um determinado instante ou fato na aplicação.
    - Diagrama de pacote
    - Diagrama de componente
    - Diagrama de estrutura
    - Diagrama de implantação
- Comportamental
    - Diagrama de atividade
    - Diagrama de sequência 
    - Diagrama de comunicação 
    - Diagrama de visão geral da interação 
    - Diagrama de tempo 
    - Diagrama de caso de uso 
    - Diagrama de transição de estados 
    - Diagrama de perfil
2. Relacionamentos
Em um diagrama as classes podem existir de forma independente, mas haverá em alguma etapa a necessidade de algumas se relacionarem.
- Associação: Uma associação define um relacionamento entre duas classes, permitindo que um objeto tenha acesso a estrutura de um outro objeto
    - Associação simples
    - Associação bidirecional 
    - Agregração: a classe principal contém uma relação com outra classe, mas ela pode existir sem a classe agregadora.
    - Composição: caracteriza uma dependência existencial entre a classe principal e a classe associada.
- Multiplicidade: Nem sempre o relacionamento entre as classes é de UM para UM, em algum determinado cenário poderá exigir multiplicidades específicas.
    - (1.)-> representa uma associação contendo **um elemento**
    - (*.)-> representa uma associação contendo **uma lista de elementos**
    - (0..1)-> representa uma associação contendo **zero ou um elemento**
    - (0..*)-> representa uma associação contendo **zero ou uma lista de elementos**
    - (1..*)-> representa uma associação contendo **um ou uma lista de elementos**
- Visibilidade: Os atributos e métodos podem receber níveis de visibilidade.
    - (+)-> visibilidade pública 
    - (#)-> visibilidade protegida
    - (-)-> visibilidade privada








