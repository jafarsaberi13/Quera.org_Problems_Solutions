#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        printf("*");
    }
    --n;
    printf("\n");
    int a = n;
    while(a > 1) {
        printf("*");
        
        for (int i = 1; i <= (n + 1) - 2; i++) {
            printf(" ");
        }
        printf("*");
        printf("\n");
        --a;
    }
    for (int i = 1; i <= n + 1; i++) {
        printf("*");
    }
}