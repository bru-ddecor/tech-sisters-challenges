# Desafio #03 — Meta de Passos 🎀

> **Comunidade:** Tech Sisters · **Linguagem:** Java · **Nível:** Iniciante  
> **Data do desafio:** 04/11/2026

## Proposta original

Desafio proposto pela comunidade **Tech Sisters** no Discord.

Uma pessoa estabeleceu a meta diária de **8.000 passos**. O programa deve receber a quantidade de passos realizados, comparar com a meta e informar se a pessoa:

- **Ultrapassou** a meta, exibindo quantos passos excedentes realizou;
- **Atingiu** exatamente 8.000 passos;
- **Não atingiu** a meta, informando quantos passos faltaram.

### Critérios

1. Receber a quantidade de passos realizados no dia.
2. Comparar o valor recebido com a meta de 8.000 passos.
3. Mostrar a situação da meta e a diferença de passos quando aplicável.

### Casos de teste da proposta

| Entrada | Resultado esperado |
| :-- | :-- |
| `10000` | Ultrapassou a meta em 2.000 passos |
| `8000` | Atingiu exatamente a meta |
| `5500` | Faltaram 2.500 passos |

> **Enunciado original:** o resumo acima apresenta os requisitos do desafio. A imagem da publicação original poderá ser anexada em `assets/enunciado-original.png`, preservando o contexto e a autoria da comunidade.

## Minha solução em Java

**[Abrir `MetaDePassos.java`](MetaDePassos.java)**

Minha implementação utiliza `Scanner` para receber os passos, `while` e `hasNextInt()` para evitar entradas não inteiras, operações matemáticas para calcular a diferença e `if / else if / else` para distinguir as três situações da meta.

### Notas de aprendizagem

- Combinei entrada de dados, validação, cálculos e estruturas condicionais.
- Corrigi o cálculo da mensagem de superação da meta para mostrar apenas os **passos excedentes**, e não o total realizado.
- Testei também uma entrada textual inválida antes de informar um número de passos.
- **Melhoria futura:** rejeitar números negativos, que ainda passam pela verificação de inteiro.

> Esta pasta registra minha solução autoral e seu estágio atual de aprendizagem.

---

[← Voltar à página principal](../../README.md)

<sub>Créditos do enunciado: comunidade Tech Sisters. Esta é uma implementação pessoal, não oficial.</sub>
