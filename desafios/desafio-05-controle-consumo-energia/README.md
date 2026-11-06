# Desafio #05 — Controle do Consumo de Energia 🎀

> **Comunidade:** Tech Sisters · **Linguagem:** Java · **Dificuldade:** Intermediário  
> **Data do desafio:** 06/11/2026

## Proposta do desafio

Uma residência deseja acompanhar o consumo diário de energia durante alguns dias. O programa deve solicitar **a quantidade de dias** e o **consumo de cada dia (em kWh)**, calcular o **consumo total** e a **média diária**, utilizando uma função para calcular a média. Também deve comparar essa média com um **limite diário informado pelo usuário**, indicando se ficou acima ou dentro do limite.

A proposta solicita que o programa não aceite quantidades de dias inválidas nem consumos negativos.

### Critérios

1. Solicitar uma quantidade de dias maior que zero.
2. Receber o consumo diário em kWh, rejeitando consumos negativos.
3. Usar uma função para calcular a média diária.
4. Comparar a média ao limite escolhido pelo usuário e exibir o resultado.

### Casos de teste da comunidade

| Caso | Entradas | Resultado esperado |
| :-- | :-- | :-- |
| 1 | 3 dias; 10, 12 e 14 kWh; limite de 11 kWh | Total: 36 kWh; média: 12 kWh; **acima** do limite |
| 2 | 2 dias; 8 e 10 kWh; limite de 10 kWh | Total: 18 kWh; média: 9 kWh; **dentro** do limite |
| 3 | Dias = -1 ou consumo = -5 kWh | Entrada inválida; solicitar novo valor |

> **Origem:** proposta publicada pela comunidade Tech Sisters no Discord em 06/11/2026. O texto acima é uma adaptação fiel dos requisitos para documentação. A imagem original do comunicado pode ser adicionada depois como `assets/enunciado-original.png`.

## Minha solução em Java

**[Abrir `ControleConsumo.java`](ControleConsumo.java)**

Desenvolvi esta solução utilizando `Scanner` para entrada de dados, um array `double[]` para armazenar os consumos, dois laços `for` para registrar e somar os valores e métodos separados para validar as entradas. O método `calcularMedia(double soma, int dias)` calcula a média diária, comparada ao limite informado pelo usuário.

### Notas de aprendizagem

- Combinei `for`, `while`, `do/while`, `if/else` e métodos com retorno.
- Aprendi a armazenar valores em um array e a usar um acumulador para somá-los.
- Adaptei os dados de consumo de `int` para `double` para aceitar quantidades fracionárias em kWh.
- Tratei textos inválidos, quantidades de dias não positivas e consumos negativos.
- Formatei os resultados com duas casas decimais utilizando `printf()`.

> Solução autoral de estudo. O arquivo Java foi preservado como escrito para o desafio.

---

[← Voltar à página principal](../../README.md)

<sub>Créditos da proposta: comunidade Tech Sisters. Esta é uma implementação pessoal, não oficial.</sub>
