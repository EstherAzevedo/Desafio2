open class ConservacaoMarinha(
    val tipoAmbiente: String,
    val areaProtegidaEmKm2: Double,
    val possuiProgramaMonitoramento: Boolean
) {
    open fun detalhes(): String {
        return """
            Tipo de Ambiente: $tipoAmbiente
            Área Protegida: $areaProtegidaEmKm2 km²
            Possui Programa de Monitoramento: $possuiProgramaMonitoramento
        """.trimIndent()
    }
}


