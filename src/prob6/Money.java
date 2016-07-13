package prob6;

public class Money {
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public Money add(Money amount) {
		return new Money(this.amount+amount.getAmount());
	}
	
	public Money minus(Money amount) {
		return new Money(this.amount-amount.getAmount());
	}
	
	public Money multiply(Money amount) {
		return new Money(this.amount*amount.getAmount());
	}
	
	public Money devide(Money amount) {
		return new Money(this.amount/amount.getAmount());
	}
	
	public int getAmount() {
		return amount;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		Money money = (Money) obj;
		return amount==money.getAmount() ? true : false;
	}

}
