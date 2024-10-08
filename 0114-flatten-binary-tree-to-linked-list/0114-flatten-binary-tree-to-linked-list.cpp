/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
private:
    TreeNode* flattenTree(TreeNode* node) {
        if (!node) return nullptr;
        if (!node->left && !node->right) return node;
        TreeNode* leftPart = flattenTree(node->left);
        TreeNode* rightPart = flattenTree(node->right);
        if (leftPart) {
            leftPart->right = node->right;
            node->right = node->left;
            node->left = nullptr;
        }
        return rightPart ? rightPart : leftPart;
    }
public:
    void flatten(TreeNode* root) {
        flattenTree(root);
    }
};