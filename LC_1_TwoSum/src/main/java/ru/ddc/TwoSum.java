package ru.ddc;

public class TwoSum {
    private Node[] arr;

    public int[] twoSum(int[] nums, int target) {
        arr = new Node[nums.length];
        Node proxy;
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            proxy = getNodeForKey(key);
            if (proxy != null) {
                return new int[]{proxy.value, i};
            } else {
                put(nums[i], i);
            }
        }
        return null;
    }

    public void put(int key, int value) {
        Node node = getNodeForKey(key);
        if (node == null) {
            node = new Node(key, value);
            int index = getIndexForKey(key);
            if (arr[index] != null) {
                node.next = arr[index];
                node.next.prev = node;
            }
            arr[index] = node;
        }
    }

    private Node getNodeForKey(int key) {
        int index = getIndexForKey(key);
        Node current = arr[index];
        while (current != null) {
            if (current.key == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int getIndexForKey(int key) {
        return Math.abs(key % arr.length);
    }

    private static class Node {
        public Node next;
        public Node prev;
        public int key;
        public int value;

        public Node(int k, int v) {
            key = k;
            value = v;
        }
    }
}
