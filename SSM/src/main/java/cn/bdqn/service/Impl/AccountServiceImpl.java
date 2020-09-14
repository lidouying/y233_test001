package cn.bdqn.service.Impl;

import cn.bdqn.domain.Account;
import cn.bdqn.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> queryAll() {
        System.out.println("查询全部账号");
        return null;
    }

    @Override
    public void save(Account account) {
        System.out.println("保存账号");
    }
}
