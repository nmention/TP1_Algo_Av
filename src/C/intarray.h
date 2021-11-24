//
// Created by nmention on 24/11/2021.
//

#ifndef TP1_ALGO_AV_INTARRAY_H
#define TP1_ALGO_AV_INTARRAY_H

typedef struct intarray {
    int* cells;
    int size;
} IntArray;

IntArray* arrayCreate();
void arrayDestroy(IntArray* a);
int arrayGet(IntArray* a, int index);
void arrayPut(IntArray* a, int index, int value);
void arrayInsert(IntArray* a, int index, int value);
int arrayRemove(IntArray* a, int index);
void arrayPrint(IntArray* a);

#endif //TP1_ALGO_AV_INTARRAY_H
