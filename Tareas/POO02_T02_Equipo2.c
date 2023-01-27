#include <stdio.h>
#include <locale.h>

int n=2; // 'n' es el número de integrantes

typedef struct{
	char nombre[20];
	long no_cuenta;
} alumno;

int main (void){
	
	setlocale(LC_ALL, "Spanish");
	int i;
	alumno a[n];
	
	printf("\nPrograma que solicita los nombres y número de cuenta de los\n"
			"integrantes de un equipo de POO.\n\n"
			"Presiona ENTER para continuar...");
	getchar();
	
	for(i = 0; i < n; i++){
		system ("cls");
		printf("\nIngresa el nombre del integrante %d: ", i+1);
		scanf(" %[^\n]", a[i].nombre);
		
		printf("Ingresa su número de cuenta: ");
		scanf("%d", &a[i].no_cuenta);
	}
	system("cls");
	printf("\nLos datos del equipos son:\n\n");
	
	for(i = 0; i < n; i++){
		printf("Nombre del integrante %d: %s\n", i+1, a[i].nombre);
		printf("Número de cuenta: %i\n\n", a[i].no_cuenta);
	}
	getchar();
	return 0;
}
