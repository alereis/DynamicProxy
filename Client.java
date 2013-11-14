
public class Client implements EmploymentRecord{

	@Override
	public void Create(Client client) {
		System.out.println("Create");
	}

	@Override
	public void Remove(Client client) {
		System.out.println("Remove");
	}

	@Override
	public void PrintRecord(Client client) {
		System.out.println("PrintRecord");
	}

	@Override
	public void UpdateSalary(Client client) {
		System.out.println("UpdateSalary");
	}

	@Override
	public void UpdateRank(Client client) {
		System.out.println("UpdateRank");
	}

	@Override
	public void Terminate(Client client) {
		System.out.println("Terminate");
	}

}
