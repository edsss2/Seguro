package seguro;

public interface TratamentoDados {
	
	public abstract String formatarDataParaSQL(String data);
	public abstract Long converterParaLong (String dadoComCaracteresEspeciais);
	public abstract int converterParaInt (String dadoComCaracteresEspeciais);
	
}
