fun main() {
    val rawData =  mapOf (
        "users1.csv" to listOf (32, 45, 17, -1, 34),
        "users2.csv" to listOf (19, -1, 67, 22),
        "users3.csv" to listOf (15, -124, 0, 12),
        "users4.csv" to listOf (56, 32, 18, 44)
	)
    
    
    //cria uma lista mutável de inteiros que vai armazenar as idades válidas (maiores que zero)
    val list_of_values: MutableList<Int> = mutableListOf<Int>()
    
    //cria um set de Strings vazio que vai armazenar o nome dos arquivos com idades inválidas
    val set_of_files: MutableSet<String> = mutableSetOf<String>()
    
    //variável que armazena a soma das idades válidas	
    var sum = 0.0

    //variável que vai armazenar o número total de idades inválidas
    var invalid_ages = 0

    //iterar por cada par de chave e valor no mapa
    for ((file_name, list) in rawData.entries){
        for (item in list) {			//para cada idade na lista
            if (item > 0) {			//se idade for maior que zero
                list_of_values.add(item)	//inclua este valor na lista de idades válidas.
                sum += item			//e some este valor à soma de idades válidas.
            } else{				//se não for maior que zero,
                set_of_files.add(file_name)	//adicione o nome do arquivo (a chave no mapa) à lista de arquivos com idades inválidas.
                invalid_ages += 1		//some 1 no contador de idades inválidas.
            }
        }
    }
    
    val media = sum / list_of_values.size 	//calcule a média de idades: soma dividido pelo numero de idades inválidas = tamanho da lista

    println("Lista de idades válidas: " + list_of_values)
    println("1. A média de idade é de %.1f anos".format(media))
    println("2. Arquivos com idades defeituosas: " + set_of_files)
    println("3. O número total de entradas com defeito é %d".format(invalid_ages))
}