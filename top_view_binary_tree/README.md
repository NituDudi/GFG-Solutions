# Top View of Binary Tree

## Problem Reference
**Problem Name:** [Top View of Binary Tree](https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1)  
**Platform:** GeeksforGeeks  
**Problem Code:** `top-view-of-binary-tree`

---

## Intuition

The **top view** of a binary tree represents all the nodes that are visible when the tree is viewed from **above**.

Imagine drawing vertical lines through the tree (each line represents a **horizontal distance**, `hd`):
- The **root** has `hd = 0`
- For every node:
  - Left child → `hd - 1`
  - Right child → `hd + 1`

The **first node** encountered at each `hd` (while traversing level by level) will appear in the **top view**.

---

## ⚙️ Approach

1. Use **Level Order Traversal (BFS)** with a **Queue** to traverse the tree level by level.
2. Maintain a **TreeMap<Integer, Integer>**, where:
   - Key → horizontal distance (`hd`)
   - Value → node data
3. For every node processed:
   - If the current `hd` is not already present in the map, insert it (first node at that distance).
4. After traversal, the **values** of the TreeMap (in sorted order of keys) represent the top view.

---

## 🧩 Data Structures Used

- **TreeMap<Integer, Integer>** → stores `(horizontalDistance → nodeValue)` in sorted order  
- **Queue<Pair>** → stores `(Node, horizontalDistance)` for BFS traversal

---
