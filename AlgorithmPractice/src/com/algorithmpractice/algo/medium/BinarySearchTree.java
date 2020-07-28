package com.algorithmpractice.algo.medium;

public class BinarySearchTree {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        //time O(n) | spaceO(n)
        public BST insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    BST bst = new BST(value);
                    left = bst;
                } else {
                    this.left.insert(value);
                }
            } else {
                if (right == null) {
                    BST bst = new BST(value);
                    right = bst;
                } else {
                    right.insert(value);
                }
            }
            return this;
        }

        //timeO(n) | spaceO(n)
        public boolean contains(int value) {
            if (value == this.value) {
                return true;
            } else if (value < this.value) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(value);
                }
            }
        }

        public BST remove(int value) {
            remove(value, null);
            return this;
        }

        public void remove(int value, BST parent) {
            if (value < this.value) {
                if (left != null) {
                    left.remove(value, this);
                }
            } else if (value > this.value) {
                if (right != null) {
                    right.remove(value, this);
                }
            } else { // value == this.value
                if (this.left != null && this.right != null) {
                    this.value = right.min();
                    right.remove(this.value, this);
                } else if (parent == null) {
                    if (this.left != null) {
                        this.value = left.value;
                        right = left.right;
                        left = left;
                    } else if (right != null) {
                        this.value = right.value;
                        left = right.left;
                        right = right.right;
                    }
                } else if (parent.left == this) {
                    parent.left = left != null ? left : right;
                } else if (parent.right == this) {
                    parent.right = left != null ? left : right;
                }
            }
        }

        public int min() {
            if (left == null) {
                return this.value;
            } else {
                return left.min();
            }
        }
    }
}
