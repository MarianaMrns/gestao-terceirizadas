PLANO DE TESTE – Gestão de Terceirizadas
1. Objetivo
Garantir que as funcionalidades principais do sistema Gestão de Terceirizadas estejam corretas e confiáveis,
validando regras de negócio através de testes unitários (JUnit).

2. Escopo
Este plano cobre as funcionalidades de:
- Cadastro e gerenciamento de empresas terceirizadas.
- Controle de contratos de prestação de serviço.
- Regras de cálculo associadas aos contratos (ex.: valor total, duração, reajuste).
Funcionalidades que envolvem banco de dados não serão testadas neste momento.

3. Estratégia de Teste
- Utilização do JUnit 5 para testes unitários.
- Testes automáticos serão versionados junto ao código-fonte.
- Testes focam em cálculos simples e regras de negócio isoladas.

4. Requisitos e Casos de Teste
4.1 Cadastro de Empresa Terceirizada
Requisito: O sistema deve permitir criar uma empresa terceirizada com nome válido.

Caso de Teste:
- Criar empresa com nome preenchido → deve ser válido.
- Criar empresa com nome vazio → deve lançar exceção ou rejeitar.

4.2 Contratos
Requisito: O sistema deve permitir criar um contrato vinculado a uma empresa terceirizada.

Casos de Teste:
- Criar contrato com valores válidos (empresa + valor + duração) → deve ser válido.
- Criar contrato sem empresa vinculada → deve falhar.

4.3 Cálculo de Valor Total
Requisito: O sistema deve calcular corretamente o valor total de um contrato.

Caso de Teste:
- Valor mensal 5.000 × duração 12 meses → resultado esperado = 60.000.
- Valor mensal 0 ou duração 0 → resultado esperado = 0.

4.4 Reajuste de Contrato
Requisito: O sistema deve aplicar reajuste percentual ao valor do contrato.

Caso de Teste:
- Valor mensal 1.000, reajuste 10% → valor esperado = 1.100.
- Reajuste negativo deve lançar exceção.

5. Ferramentas
JUnit 5 (unit tests).
Maven (gerenciamento de dependências e execução de testes).

6. Critérios de Aceite
- Todos os testes unitários devem passar com sucesso.
- Código versionado no GitHub deve conter pasta de testes.
- Novas regras de negócio devem ser acompanhadas de novos testes unitários.
