package cn.bdqn.mapper;

import cn.bdqn.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountMapper")
public interface AccountMapper {
    public List<Account> selectAll();
    public void insert(Account account);
}
