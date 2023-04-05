package Avaliaçãods1;

public class Cliente extends Juridica {
	
	private int protocoloAtendimento;
	

	public int getProtocoloAtendimento() {
		return protocoloAtendimento;
	}

	public void setProtocoloAtendimento(int protocoloAtendimento) {
		this.protocoloAtendimento = protocoloAtendimento;
	}

	@Override
	public String toString() {
		return "Cliente [protocoloAtendimento=" + protocoloAtendimento + "]";
	}
	
	
}
