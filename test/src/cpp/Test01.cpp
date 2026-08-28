#include <stdio.h>

// 1. Vector 구조체 정의
struct Vector {
    int x;
    int y;
    int z;
};

// 2. 두 벡터를 더하는 함수 (TODO: 완성해 보세요)
void addVector(const struct Vector *v1, const struct Vector *v2, struct Vector *result) {
    
}

int main(void) {
    struct Vector vecA = {1, 2, 3};
    struct Vector vecB = {10, 20, 30};
    struct Vector sum = {0, 0, 0};

    // 주소(&)를 넘겨서 함수 호출
    addVector(&vecA, &vecB, &sum);

    // 결과 출력: (11, 22, 33)
    printf("sum: (%d, %d, %d)\n", sum.x, sum.y, sum.z);

    return 0;
}