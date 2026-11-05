# Desafio #04 — Compra Parcelada 🎀

> **Comunidade:** Tech Sisters · **Linguagem:** Java · **Nível:** Iniciante  
> **Data do desafio:** 05/11/2026

## Proposta do desafio

Uma loja permite parcelar compras em **5 vezes** quando o valor total é **menor ou igual a R$ 250,00**. O programa deve receber os preços de dois produtos e informar se o parcelamento é permitido. Se for, deve mostrar o valor de cada parcela.

### Critérios

1. Receber o preço do primeiro e do segundo produto.
2. Calcular o valor total da compra.
3. Verificar se o total não ultrapassa R$ 250,00.
4. Se a compra puder ser parcelada, apresentar o valor das cinco parcelas.

### Casos de teste da proposta

| Primeiro produto | Segundo produto | Resultado esperado |
| :-- | :-- | :-- |
| R$ 100,00 | R$ 100,00 | Compra aprovada, 5 × R$ 40,00 |
| R$ 180,00 | R$ 100,00 | Total de R$ 280,00; parcelamento não permitido |

*Enunciado proposto pela comunidade Tech Sisters no Discord. Este README resume os requisitos da publicação original; a captura da proposta poderá ser preservada futuramente em `assets/enunciado-original.png`.*

## Minha solução em Java

**[Abrir `CompraParcelada.java`](CompraParcelada.java)**

A solução utiliza `Scanner` para ler os preços, calcula o total e divide a compra em cinco parcelas quando respeita o limite estabelecido. Para evitar repetir a lógica de leitura, criei o método `valorValido(Scanner input)`, usado para os dois produtos.

### Notas de aprendizagem

- Pratiquei a reutilização de um método com parâmetro e retorno `double`.
- Usei `hasNextDouble()` e `while` para rejeitar entradas que não sejam números decimais.
- Utilizei `if / else` para aplicar a regra de parcelamento.
- Formatei valores monetários com `System.out.printf()` e `%.2f`.
- **Melhoria futura:** rejeitar preços negativos e explorar o uso de `BigDecimal` para cálculos financeiros com precisão decimal.

> Solução autoral de estudo, mantida como foi enviada no desafio.

---

[← Voltar à página principal](../../README.md)

<sub>Crédito do enunciado: comunidade Tech Sisters. Esta implementação é pessoal e não oficial.</sub>
