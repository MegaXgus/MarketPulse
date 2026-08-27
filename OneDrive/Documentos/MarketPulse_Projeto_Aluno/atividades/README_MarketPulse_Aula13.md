# MarketPulse — Aula 13

## Tema
Integração, contratos, implantação, Adapter e Facade

## Situação do projeto
O MarketPulse contém decisões e artefatos legados que podem estar incompletos, inconsistentes ou inadequados ao conteúdo desta aula. O aluno deve analisar o estado atual antes de modificar.

## O que o aluno deve fazer
1. definir um contrato de integração para pelo menos uma corretora ou fonte de cotação;
2. corrigir ou substituir `AlphaBrokerAdapter` para que a interface legada não vaze para o restante da aplicação;
3. reavaliar `MarketPulseFacade` e impedir que consumidores contornem a própria fachada por acesso direto aos subsistemas;
4. propor topologia de implantação coerente com requisitos não funcionais e registrar ADRs de Adapter e Facade.

## Dicas
- Adapter deve compatibilizar interfaces, não apenas renomear uma chamada.
- Facade deve simplificar o acesso sem expor indevidamente seus subsistemas.

## Evidências mínimas da entrega
- Issue identificada como `Aula 13`.
- Branch sugerida: `aula-13`.
- Commits com mensagens que expliquem mudanças relevantes.
- README/Markdown da entrega contendo **problema observado, alteração realizada e critério de aceitação**.
- PR ou registro equivalente permitindo revisão do grupo.

## Prazo operacional
O trabalho deve começar em sala. O limite de conclusão é o início da aula seguinte, salvo orientação diferente do professor.
