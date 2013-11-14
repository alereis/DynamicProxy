
public interface EmploymentRecord {
	// create
	public void Create(Client client);
	
	// remove
	public void Remove(Client client);
	
	// print record
	public void PrintRecord(Client client);
	
	// update salary
	public void UpdateSalary(Client client);
	
	// update rank
	public void UpdateRank(Client client);
	
	// terminate
	public void Terminate(Client client);
}
