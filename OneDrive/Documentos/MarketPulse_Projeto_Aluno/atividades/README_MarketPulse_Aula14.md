# MarketPulse — Aula 14

## Tema
Padrões de projeto e baixo nível

## Situação do projeto
O MarketPulse contém decisões e artefatos legados que podem estar incompletos, inconsistentes ou inadequados ao conteúdo desta aula. O aluno deve analisar o estado atual antes de modificar.

## O que o aluno deve fazer
1. corrigir ou substituir o uso de Strategy na lógica de estratégia de investimento/decisão;
2. reavaliar `OrderFactory` e aplicar Factory Method apenas quando a variação de criação for justificável;
3. reavaliar `TradingFamilyFactory` e aplicar Abstract Factory somente a famílias coerentes de objetos relacionados;
4. corrigir o mecanismo de Observer para suportar múltiplos interessados e um ciclo de inscrição adequado;
5. revisar Adapter e Facade da Aula 13 para manter coerência entre os seis padrões;
6. produzir, para cada padrão mantido, código, UML/Mermaid e ADR.

## Dicas
- Não aplicar padrão apenas para cumprir lista.
- Cada padrão deve resolver um problema identificável do MarketPulse.
- Registrar alternativas consideradas e consequências.

## Evidências mínimas da entrega
- Issue identificada como `Aula 14`.
- Branch sugerida: `aula-14`.
- Commits com mensagens que expliquem mudanças relevantes.
- README/Markdown da entrega contendo **problema observado, alteração realizada e critério de aceitação**.
- PR ou registro equivalente permitindo revisão do grupo.

## Prazo operacional
O trabalho deve começar em sala. O limite de conclusão é o início da aula seguinte, salvo orientação diferente do professor.
