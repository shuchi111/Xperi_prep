/*Problem statement
Write a  function  that create tree should make in  label as subtree as a capital and it should be return a pointer 
to the tree.
*/

#include <iostream>
#include <cctype> // for toupper
using namespace std;

struct TreeNode {
    char label;
    TreeNode* left;
    TreeNode* right;
    TreeNode(char x) : label(x), left(nullptr), right(nullptr) {}
};

void convertToUpper(TreeNode* node) {
    if (node == nullptr) return;
    node->label = toupper(node->label);
    convertToUpper(node->left);
    convertToUpper(node->right);
}

TreeNode* createTree() {
    TreeNode* root = new TreeNode('a');
    root->left = new TreeNode('b');
    root->right = new TreeNode('c');
    root->left->left = new TreeNode('d');
    root->left->right = new TreeNode('e');
    root->right->left = new TreeNode('f');
    root->right->right = new TreeNode('g');
    convertToUpper(root);
    return root;
}

void printTree(TreeNode* node) {
    if (node == nullptr) return;
   cout<< node->label << " ";
    printTree(node->left);
    printTree(node->right);
}

int main() {
    TreeNode* root = createTree();
    printTree(root);
    return 0;
}
