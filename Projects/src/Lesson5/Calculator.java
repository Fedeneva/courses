package Lesson5;

public class Calculator {
    private double result;
    private static String[] sOperations;

    static {
        sOperations = new String[]{
                "+", "-",
                "*", "/"
        };
    }


    public Calculator() {
        result = 0;
    }

    private String replaceBracketsByIndexes(String expression, int startIndex, int endIndex) {
        double result = calculate(expression.substring(startIndex + 1, endIndex));
        return expression.substring(0, startIndex) + Double.toString(result)
                + expression.substring(endIndex + 1, expression.length());
    }

    private String replaceBrackets(String expression) {
        int startBoundIndex;
        int endBoundIndex;
        int openBracketsCount;

        int i = -1;

        while (expression.contains("(") || expression.contains(")")) {
            startBoundIndex = -1;
            endBoundIndex = -1;
            openBracketsCount = 0;

            while (++i < expression.length()) {
                char currentLetter = expression.charAt(i);
                if (currentLetter == '(' && openBracketsCount++ == 0) {
                    startBoundIndex = i;
                } else if (currentLetter == ')' && --openBracketsCount == 0) {
                    endBoundIndex = i;
                    break;
                }
            }
            if (startBoundIndex * endBoundIndex < 0) {
                System.out.println("There is a bracket without pair.");
                return "";
            }
            if (startBoundIndex == -1 && endBoundIndex == -1) {
                return expression;
            }
            expression = replaceBracketsByIndexes(expression, startBoundIndex, endBoundIndex);
            i = endBoundIndex;
        }
        return expression;
    }

    private int getIndexOfLowestOperation(String expression) {
        int operationNumber = 0;
        int operationIndex;
        if (expression.isEmpty()) {
            return -1;
        }
        for (String operation : sOperations) {
            if ((operation.equals("+") || operation.equals("-")) &&
                    (operationIndex = expression.indexOf(operation)) != -1) {
                return operationIndex;
            }
            else if ((operation.equals("*") || operation.equals("/")) &&
                    (operationIndex = expression.lastIndexOf(operation)) != -1) {
                return operationIndex;
            }
//            if ((operationIndex = expression.lastIndexOf(sOperations[operationNumber])) != -1) {
//                return operationIndex;
//            }
        }
        return -1;
    }

    private double calculatePart(String expression) {
        int operationIndex = getIndexOfLowestOperation(expression);
        if (operationIndex == -1) {
            if (expression.equals("")) {
                return 0;
            }
            return Double.parseDouble(expression);
        }
        switch (expression.charAt(operationIndex)) {
            case '+':
                return calculatePart(expression.substring(0, operationIndex)) +
                        calculatePart(expression.substring(operationIndex + 1, expression.length()));
            case '-':

                return calculatePart(expression.substring(0, operationIndex)) -
                        calculatePart(expression.substring(operationIndex + 1, expression.length()));
            case '*':
                return calculatePart(expression.substring(0, operationIndex)) *
                        calculatePart(expression.substring(operationIndex + 1, expression.length()));
            case '/':
                return calculatePart(expression.substring(0, operationIndex)) /
                        calculatePart(expression.substring(operationIndex + 1, expression.length()));
            default:
                System.out.println("Wrong operation.");
                return 0;
        }
    }

    public double calculate(String expression) {
        expression = replaceBrackets(expression);
        if (expression.isEmpty()) {
            // error found
            return 0;
        }
        return calculatePart(expression);
    }

    public void fitExpression(String expression) {
        result = calculate(expression);
    }

    public double getResult() {
        return result;
    }
}
