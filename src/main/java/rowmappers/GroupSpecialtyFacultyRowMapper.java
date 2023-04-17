package rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spr.api.Faculty;
import com.spr.api.Group;
import com.spr.api.Specialty;

public class GroupSpecialtyFacultyRowMapper implements RowMapper<Group> {

	@Override
	public Group mapRow(ResultSet rs, int rowNum) throws SQLException {

		Faculty faculty = new Faculty();
		Specialty specialty = new Specialty();
		Group group = new Group();

		faculty.setId(rs.getInt("faculty.id"));
		faculty.setFacultyName(rs.getString("faculty.faculty_name"));

		specialty.setFaculty(faculty);
		specialty.setId(rs.getInt("specialty.id"));
		specialty.setSpecialtyName(rs.getString("specialty.specialty_name"));
		specialty.setSpecialtyUkrName(rs.getString("specialty.ukraine_specialty_name"));

		group.setSpecialty(specialty);
		group.setId(rs.getInt("groups.id"));
		group.setGroupName(rs.getString("groups.group_name"));
		group.setCourse(rs.getInt("groups.course"));
		group.setFormName(rs.getString("studyform.form_name"));
		group.setProgrammName(rs.getString("studyprogramm.name"));

		return group;
	}

}
