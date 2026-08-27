# Evidência da entrega
- **Aula:** 01 - Fundamentos e organização do repositório
- **Integrantes:** Gustavo Alves Queiroz
- **Issue:** #1 - Análise de fundamentos e reestruturação inicial (Aula 01)
- **Branch:** `aula-01`
- **PR/merge:** pendente

## Problema observado
Analisando o código atual da classe `TradingApplicationService.java`, observou-se problemas de design:
1. **Violação do SRP (Princípio da Responsabilidade Única):** A classe age como uma "God Class".
2. **Violação do OCP (Princípio do Aberto/Fechado):** Uso de if/else rígidos para roteamento.
3. **Violação do DIP (Princípio da Inversão de Dependência):** Alto acoplamento usando `new`.
4. **Organização Arquitetural Inadequada:** Arquivos agrupados por tipo técnico.
5. **Anomalia de Transação:** O saldo é descontado antes da confirmação externa.

## Alteração realizada
1. Mapeamento de Requisito, Arquitetura, Design e Implementação.
2. Proposta de Nova Organização de Pastas (Clean Architecture).

## Critério de aceitação
- Diferenças registradas, nova estrutura justificada e violações identificadas.
