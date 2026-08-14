# MarketPulse — Projeto Semestral

O MarketPulse simula uma plataforma de investimentos que recebe ordens de compra e venda, consulta cotações, encaminha operações a diferentes corretoras, calcula custos, executa validações básicas e envia alertas ao investidor.

Este repositório representa um **sistema legado em evolução**. O fato de o código compilar não significa que seu design esteja correto. Durante o semestre, o aluno deverá analisar, justificar e modificar o projeto conforme os conteúdos apresentados em aula.

## Escopo inicial
- cadastro simplificado de investidores;
- consulta de cotações;
- ordens de compra e venda;
- integração com diferentes corretoras;
- cálculo de custos e taxas;
- estratégias de investimento;
- alertas por e-mail/SMS/WhatsApp;
- registro simplificado de operações.

## Execução
Requer Java 17 e Maven.

```bash
mvn compile
java -cp target/classes br.edu.marketpulse.Main
```

## Organização das atividades
Cada aula possui um arquivo em `atividades/README_MarketPulse_AulaXX.md`. O aluno deve iniciar a atividade em sala e registrar a evolução no próprio GitHub.

> Não se deve presumir que classes denominadas como padrões de projeto estejam corretamente implementadas. O aluno deve justificar tecnicamente o que mantém, altera ou remove.
