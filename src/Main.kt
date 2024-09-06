fun main() {
    lateinit var areaProtegida: AreaProtegidaMarinha

    val reservaMarinha = ReservaMarinha("Coral", 1500.0, true, TipoReserva.BIOLOGICA)
    println(reservaMarinha.detalhes())
    println("----")

    areaProtegida = AreaProtegidaMarinha("Manguezal", 500.0, true, TipoProtecao.TOTAL)
    println(areaProtegida.detalhes())
    println("----")

    // Reserva Marinha sem programa de monitoramento
    val reservaMarinha2 = ReservaMarinha("Praia", 750.0, false, TipoReserva.TURISMO)
    println(reservaMarinha2.detalhes())
    println("----")
}