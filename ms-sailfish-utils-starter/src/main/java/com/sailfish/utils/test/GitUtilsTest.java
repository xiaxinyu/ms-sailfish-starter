package com.sailfish.utils.test;

import org.eclipse.jgit.api.Git;

import com.sailfish.utils.GitUtils;

import java.io.File;

public class GitUtilsTest {
    public static void main(String[] args) {
        String workDir = "D:\\test-commit";
        String repoAddress = "http://gitlab.devopsuat.crc.com.cn/crc-template/test-commit.git";
        String token = "zG2XUWANizBvzh-wJZAx";

        Git git = GitUtils.initLocalRepository(new File(workDir));
        GitUtils.commitAndPush(git, repoAddress, token);
    }
}
