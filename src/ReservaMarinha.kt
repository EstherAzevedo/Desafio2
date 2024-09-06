class ReservaMarinha(
    tipoAmbiente: String,
    areaProtegidaEmKm2: Double,
    possuiProgramaMonitoramento: Boolean,
    val tipoReserva: TipoReserva
) : ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento) {

    override fun detalhes(): String {
        return with(super.detalhes()) {
            this + "\nTipo de Reserva: $tipoReserva"
        }
    }
}

class AreaProtegidaMarinha(
    tipoAmbiente: String,
    areaProtegidaEmKm2: Double,
    possuiProgramaMonitoramento: Boolean,
    val tipoProtecao: TipoProtecao
) : ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento) {

    override fun detalhes(): String {
        return with(super.detalhes()) {
            this + "\nTipo de Proteção: $tipoProtecao"
        }
    }
}
