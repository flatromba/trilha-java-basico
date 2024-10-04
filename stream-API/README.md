## Stream API 
- Manipulação de coleções Java seguindo os princípios da programação funcional
- Processa coleções de maneira declarativa, ao invés da forma imperativa
```
//método para calcular valor total dos itens sem utilizar o Stream API
public class CarrinhoDeCompras {
  //atributos
  private List<Item> itemList;
  //construtor
  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }  
  
  public double calcularValorTotal() {
    double valorTotal = 0d;
    if (!itemList.isEmpty()) {
      for (Item item : itemList) {
        double valorItem = item.getPreco() * item.getQuant();
        valorTotal += valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}

//método para calcular valor total dos itens utilizando o Stream API
public class CarrinhoDeCompras {
  //atributos
  private List<Item> itemList;
  //construtor
  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }
  
  public double calcularValorTotal() {
    if (itemList.isEmpty()) {
      throw new RuntimeException("A lista está vazia!");
    }
    return itemList.stream()
        .mapToDouble(item -> item.getPreco() * item.getQuant())
        .sum();
  }
}
```
- As operações na Stream API podem ser classificadas em duas categorias
1. **Operações Intermediárias**: são as que retornam uma nova Stream e permitem encadear várias operações, formando um pipeline de processamento de dados.
- `filter(Predicate<T> predicate)`: Filtra os elementos com base em um predicado, retorna uma nova Stream contento apenas os elementos que atendem ao critério. Ex.: `stream.filter(n -> n>5)`
- `map(Function<T,R> mapper)`: Transforma cada elemento usando a função especificada, retorna uma nova Stream contendo os elementos resultantes. Ex.: `stream.map(s -> s.ToUpperCase())`
- `sorted()`: classifica os elementos em ordem natural ou de acordo com um comparador fornecido. Ex.: `stream.sorted()`
- `distinct()`: remove elementos duplicados, considerando a implementação do método equals() para comparação. Ex.: `stream.distinct()`
- `limit(long maxSize)`: limita o número de elementos aos maxSize primeiros elementos. Ex.: `stream.limit(10)`
- `skip(long n)`: pula os primeiros n elementos, retorna uma nova Stream sem eles. Ex.: `stream.skip(5)`
2. **Operações Terminais**: são as que encerram o pipeline e produzem um resultado.
- `forEach(Consumer<T> action)`: executa uma ação para cada elemento. Ex.: `stream.forEach(System.out::println)`
- `toArray()`: Converte em um array contendo os elementos da Stream. Ex.: `stream.toArray()`
- `collect(Collection<T,A,R> collector)`: coleta os elementos em uma estrutura de dados específica. Ex.: `stream.collect(Collectors: toList())`
- `count()`: retorna o número de elementos. Ex.: `stream.count()`
- `anyMatch(Predicate<T> predicate)`: verifica se algum elemento atende ao predicado. Ex.: `stream.anyMatch(s -> s.startsWith("A"))`
- `allMatch(Predicate<T> predicate)`: verifica se todos os elementos atendem ao predicado. Ex.: `stream.allMatch(n -> n>0)`
- `noneMatch(Predicate<T> predicate)`: verifica se nenhum elemento atende ao predicado. Ex.: `stream.noneMatch(s -> s.isEmpty())`
- `min(Comparator<T> comparator)`: encontra o elemento mínimo. Ex.: `stream.min(Comparator.naturalOrder())`
- `max(Comparator<T> comparator)`: encontra o elemento máximo. Ex.: `stream.max(Comparator.naturalOrder())`
- `reduce(T identity, BinaryOperator<T> accumulator)`: combina os elementos usando o acumulador e retorna o resultado. Ex.: `stream.reduce(0,(a,b) -> a+b)`
## Expressões Lambda
- Permitem representar interfaces funcionais de forma mais concisa e possibilitam escrever o código no estilo funcional
- É uma função sem declaração, ou seja, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso
- Tem a sintaxe definida como (argumento) -> (corpo)
```
public class OrdenacaoPessoa {
  //atributo
  private List<Pessoa> pessoaList;

  //construtor
  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public List<Pessoa> ordenarPorAltura() {
    if (!pessoaList.isEmpty()) {
      List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
      pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}
```
## Method Reference
- Permite fazer referência a um método ou construtor de uma classe e assim indicar que ele deve ser utilizado num ponto específico do código
```
public class OrdenacaoPessoa {
  //atributo
  private List<Pessoa> pessoaList;

  //construtor
  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public List<Pessoa> ordenarPorAltura() {
    if (!pessoaList.isEmpty()) {
      List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
      pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}
```

## Optional
O objetivo é fornecer uma abordagem mais segura e expressiva para tratar casos em que um valor pode ser ausente (nulo), permite encapsular um valor que pode ser nulo dentro de um objeto Optional.
- `of(value)`: cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção NullPointerException
```
Optional<String> optionalValue = Optional.of("Hello");
System.out.println(optionalValue.get());
```
- `ofNullable(value)`: cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo
```
String nullableValue = null;
Optional<String> optionalValue = Optional.ofNullable(nullableValue);
System.out.println(optionalValue.isPresent());
```
- `empty()`: retorna um Optional vazio (sem valor)
```
Optional<String> optionalValue = Optional.empty();
System.out.println(optionalValue.isPresent());
```
- `isPresent()`: verifica se o Optional contém um valor não nulo
```
Optional<String> optionalValue = Optional.of("Hello");
System.out.println(optionalValue.isPresent());
```
- `isEmpty()`: verifica se o Optional está vazio (não contém um valor não nulo)
```
Optional<String> optionalValue = Optional.ofNullable(null);
System.out.println(optionalValue.isEmpty());
```
- `get()`: obtém o valor contido no Optional. Se o valor for nulo, lançará uma exceção NoSuchElementException
```
Optional<String> optionalValue = Optional.of("Hello");
System.out.println(optionalValue.get()); 
```
- `orElse(defaultValue)`: obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio
```
Optional<String> optionalValue = Optional.ofNullable(null);
String result = optionalValue.orElse("Default"); 
System.out.println(result);
```
- `orElseGet(supplier)`: obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio
```
Optional<String> optionalValue = Optional.ofNullable(null);
String result = optionalValue.orElseGet(() -> "Value from Supplier");
System.out.println(result);
```
- `orElseThrow(exceptionSupplier)`: obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio
```
Optional<String> optionalValue = Optional.ofNullable(null);
String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
```
- `ifPresent(consumer)`: executa uma ação fornecida por um Consumer se o Optional contiver um valor
```
Optional<String> optionalValue = Optional.of("Hello");
optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
```



