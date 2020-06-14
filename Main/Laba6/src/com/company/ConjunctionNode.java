package com.company;

public class ConjunctionNode implements AbstractNode {

        private final AbstractNode left;
        private final AbstractNode right;
    private final Collection<AbstractNode> list;
        public ConjunctionNode(AbstractNode left, AbstractNode right) {
            this.left = left;
            this.right = right;
        }
        @Override
        public boolean calculate() {
            return left.calculate() && right.calculate();
        }
        @Override
        public String toString() {
        return  left + " and " + right ;
    }
}
