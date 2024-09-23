# Collecions
## Collecion Framework API
- Estrutura de dados que serve para agrupar elementos em uma unidade, esses elementos precisam ser **objetos**
- Podem ter coleções homogêneas ou heterogêneas, normalmente é utilizada as homogêneas
- Existem quatro tipos de coleções: `List`, `Set`, `Queue` e `Map`

![alt text](image.png)

- Todas as interfaces e classes são encontradas dentro do pacote `java.util`
- Embora a interface `Map` não seja filha direta da interface `Collection` ela é considerada uma coleção devido sua função

![alt text](Screenshot_4.png)

## Generics type
- É uma classe ou interface que é parametrizada em relação a tipos
- Uma variável de tipo pode ser qualquer tipo não primitivo que você especificar: qualquer tipo de classe, qualquer tipo de interface, qualquer tipo de array ou até mesmo outra variável de tipo.
- Essa mesma técnica pode ser aplicada para criar interfaces genérica.
- Os nomes de parâmetros de tipo mais comumente usados são:
    - E - Elemento (usado extensivamente pelo Java Collections Framework)
    - K - Chave
    - N - Número
    - T - Tipo
    - V - Valor
    - S, U, V, etc. - 2º, 3º, 4º tipos
- O uso de generics garante que apenas objetos de um tipo específico possam ser adicionados à coleção, evitando erros de tipo e garantindo que você esteja lidando com os dados corretos.
- Ao usar generics, você pode especificar o tipo de dados esperado ou retornado pela coleção, o que torna o código mais fácil de entender e ler.
- O compilador verifica se você está usando os tipos corretos durante a compilação, ajudando a identificar erros de tipo antes mesmo de executar o programa.
- Com generics, você pode criar classes e métodos genéricos que funcionam com diferentes tipos de coleções, evitando a necessidade de duplicar código para cada tipo específico.
- O uso de generics pode melhorar o desempenho, pois evita a necessidade de conversões de tipo desnecessárias e permite que o compilador otimize o código com base no tipo especificado.

## Comparable X comparator
- Comparable
    - fornece uma única sequência de ordenação
    - afeta a classe original, ou seja, a classe atual é modificada
    - fornece o método `compareTo()` para ordenar elementos
    - está presente no pacote `java.lang`
    - podemos ordenar os elementos da lista usando o método `Collections.sort(List)`
- Comparator
    - fornece o método `compare()` para ordenar elementos
    - fornece múltiplas sequências de ordenação
    - não afeta a classe original, ou seja, a classe atual não é modificada
    - está presente no pacote `java.util`
    - podemos ordenar os elementos da lista usando o método `Collections.sort(List, Comparator)`

## List
- Uma coleção ordenada que permite inclusão de elementos duplicados
- Se assemelha a uma matriz com comprimento dinâmico, permitindo adicionar ou remover elementos
- Fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos com base no índice
- A classe Collections fornece algoritmos úteis para manipulação de List, como ordenação (sort), embaralhamento (shuffle), reversão (reverse) e busca binária (binarySearch)
### ArrayList
- Implementação da interface List que armazena os elementos em uma estrutura de array redimensionável. Isso significa que ele pode crescer automaticamente à medida que novos elementos são adicionados. A principal vantagem do ArrayList é o acesso rápido aos elementos por meio de índices, o que permite recuperar um elemento específico de forma eficiente. No entanto, adicionar ou remover elementos no meio da lista pode ser mais lento, pois requer a realocação de elementos
### LinkedList
- Implementação da interface List que armazena os elementos em uma lista duplamente vinculada. Cada elemento contém referências para o elemento anterior e próximo na lista. A principal vantagem do LinkedList é a eficiência na adição ou remoção de elementos no início ou no final da lista, pois não é necessário realocar elementos. No entanto, o acesso aos elementos por meio de índices é mais lento, pois requer percorrer a lista até o elemento desejado
### Vector
- Implementação antiga da interface List que é semelhante ao ArrayList, mas é sincronizada, ou seja, é thread-safe. Isso significa que várias threads podem manipular um objeto Vector ao mesmo tempo sem causar problemas de concorrência. No entanto, essa sincronização adiciona uma sobrecarga de desempenho, tornando o Vector menos eficiente do que o ArrayList em cenários em que a concorrência não é um problema. Por esse motivo, o uso do Vector é menos comum em aplicações modernas

## Set
- Uma coleção que não pode conter elementos duplicados
- Representa o conceito matemático de um conjunto e é usada para representar conjuntos
- Possui três implementações de uso geral: `HashSet`, `TreeSet` e `LinkedHashSet`
- Não permite acesso aleatório a um elemento da coleção
- Para percorrer os elementos, pode usar um iterador ou um loop foreach
### HashSet
- Implementação da interface Set que armazena os elementos em uma tabela hash. Ele não mantém uma ordem específica dos elementos. A principal vantagem do HashSet é que ele oferece um desempenho de busca muito eficiente, pois usa funções hash para indexar os elementos. No entanto, a ordem em que os elementos são adicionados pode não ser preservada ao percorrer o conjunto
### TreeSet
- Implementação da interface Set que armazena os elementos em uma árvore binária balanceada. Isso significa que os elementos são armazenados em uma ordem classificada e são mantidos automaticamente em ordem crescente. A principal vantagem do TreeSet é que os elementos são sempre retornados na ordem classificada, o que facilita a obtenção de elementos em uma determinada ordem. No entanto, a busca e a inserção são um pouco mais lentas em comparação com o HashSet
### LinkedHashSet
- Implementação da interface Set que mantém a ordem de inserção dos elementos, além de usar uma tabela hash para obter um bom desempenho de busca. Ele é semelhante ao HashSet, mas também mantém uma lista duplamente vinculada que preserva a ordem de inserção. Isso permite que os elementos sejam percorridos na ordem em que foram adicionados. O LinkedHashSet é útil quando você precisa manter a ordem de inserção dos elementos e também ter um bom desempenho de busca
## Map
- Usada para mapear dados na forma de chaves e valores
- É um objeto que mapeia chave para valores
- Não pode conter chaves duplicadas(cada chave pode mapear no máximo um valor)
- Possui três implementações gerais: `HashMap`, `TreeMap` e `LinkedHashMap`
- Operações básicas: `put`(inserir ou atualizar), `get`(obter), `containsKey`(verificar se contém uma chave), `contains Value`(verificar se contém um valor), `size`(obter tamanho) e `isEmpty`(verificar se está vazio)
### HashTable
- Implementação antiga da interface Map no Java que é sincronizada e thread-safe, tornando-a adequada para uso em ambientes concorrentes. Ela não permite chaves ou valores nulos e os elementos não são mantidos em uma ordem específica
### HashMap
- Implementação da interface Map que não mantém uma ordem específica dos elementos. Ele armazena os elementos internamente usando uma função de hash para melhorar a eficiência das operações de pesquisa e acesso. O HashMap também permite chaves ou valores nulos
### LinkedHashMap
- Implementação da interface Map que preserva a ordem de inserção dos elementos. Cada elemento possui referências ao próximo e ao anterior, formando uma lista encadeada. Isso permite que os elementos sejam iterados na ordem em que foram inseridos. Além disso, o LinkedHashMap também permite chaves ou valores nulos


